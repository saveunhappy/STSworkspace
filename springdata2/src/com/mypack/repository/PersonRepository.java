package com.mypack.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.mypack.domain.Person;
//这个就可以用注解来代替
//@RepositoryDefinition(domainClass=Person.class,idClass=Integer.class)
public interface PersonRepository extends CrudRepository<Person, Integer> {
	//根据lastName 来获取对应的ID
	Person getByLastName(String name);
	//WHERE lastName LIKE ?% AND id < ?
	List<Person> getByLastNameStartingWithAndIdLessThan(String lastName,Integer id);
	//WHERE lastName LIKE %? AND id < ?
	List<Person> getByLastNameEndingWithAndIdLessThan(String lastName,Integer id);
	//WHERE email IN(?,?,?) OR birth < ?
	List<Person> getByEmailInOrBirthLessThan(List<String> emails,Date birth);
	//查询id值最大的那个Person
	@Query("select p from Person p where p.id = (select max(p2.id) from Person p2)")
	//@Query("SELECT p FROM Person p WHERE p.id = (SELECT max(p2.id) FROM Person p2)")
	//使用Query注解可以自定义JPQL语句实现更灵活的查询
	Person getMaxIdPerson();
	//使用占位符参数
	//两个地方使用一个占位符参数也是可以的
	@Query("select p from Person p where p.lastName = ?1 or p.email = ?1") 
	List<Person> testQueryAnnotationParam1(String lastName);
	@Query("select p from Person p where p.lastName = ?1 and p.email = ?2")
	List<Person> testQueryAnnotationParam1(String lastName,String email);
	@Query("select p from Person p where p.lastName = :lastName and p.email = :email")
	List<Person> testQueryAnnotationParam2(@Param("email")String email,@Param("lastName") String lastName);
	@Query("select p from Person p where p.lastName like %?1% and p.email like %?2%")
	List<Person> testQueryAnnotationParam3(String lastName,String email);
	//使用nativeQuery来使用原生的SQL
	@Query(value="select count(id) from jpa_persons",nativeQuery=true)
	long getTotalCount();
	//可以通过自定义的JPQL完成update或者delete操作，注意：JPQL不支持Insert
	//在@Query注解中编写JPQL语句，但必须使用MOdifying进行修饰，以通知SpringData，这是一个update或者delete操作
	//update或者delete操作需要事务
	@Modifying
	@Query("update Person p set p.email = :email where id = :id")
	void updatePersonEmail(@Param("id")Integer id,@Param("email")String email);
}
