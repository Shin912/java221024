use shoppingmall;


insert into member(me_id, me_pw, me_name, me_birth, me_authority)
	values('abc', '123', '홍길동', '2000-01-01', 'MEMBER');
-- 전체 열명을 나열하지 않아도 가능. 단, 생략한 열이 null 허용이거나 기본값이 존재해야 함

insert into member(me_id, me_pw, me_name, me_birth)
	values('qwe', '123', '고길동', '2000-01-01');
-- 열 순서를 바꿔도 가능. 단, 열 순서에 맞게 값 순서를 잘 설정.

insert into member(me_id, me_name, me_birth, me_pw)
	values('asd', '이순신', '2000-01-01', '123');
-- 열을 전체 생략해도 가능. 단, 테이블 생성 시 추가했던 열 순으로 값들을 입력해야 함.

insert into member 
	values('qwe123', 'qwe123', '홍씨', '2002-02-02', 'MEMBER'),
	('zxc132', 'zxc123', '박씨', '2002-02-01', 'ADMIN');
    
select *from member;
