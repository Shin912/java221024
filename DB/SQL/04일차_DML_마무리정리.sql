/*
DML
 - insert
 - update
 - delete
 - select
 
insert
 - 문법
insert into 테이블명(속성1, 속성2, ..., 속성n)
	values(값1, 값2, ..., 값n);
insert into 테이블명 values(값1, 값2, ..., 값n);
	- 이때 값이 개수는 전체 테이블 속성 개수와 같고, 순서가 맞아야 한다
insert into 테이블명(속성1, 속성2, ..., 값n)
	selet 값1, 값2, ..., 값m, 속성1, 속성2, 속성 n-m
		from 테이블명 [where 절]
	- 추가하려는 값이 검색을 통해 넣어야 하는 경우 사용
    
update
- 문법
update 테이블명 set 속성1 = 값1, 속성2 = 값2, ..., 속성n = 값n where절

delete
- 문법
delete from 테이블명 where절

select
- 문법
select [distinct] 속성1, 속성2, ..., 속성n from 테이블
	where절
    order by절
    limit절
- where절
 between A and B
 in()
 all()
 any()
 서브쿼리
- order by절
	asc : 오름차순, desc : 내림차순
 */
 
 