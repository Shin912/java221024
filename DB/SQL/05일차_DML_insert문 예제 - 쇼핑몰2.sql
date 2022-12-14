INSERT INTO `shoppingmall2`.`member` (`me_id`, `me_pw`, `me_name`, `me_authority`, `me_point`) 
VALUES ('abc', 'abc', 'ABC마트', 'MEMBER', '0');
INSERT INTO `shoppingmall2`.`member` (`me_id`, `me_pw`, `me_name`, `me_birth`, `me_authority`, `me_point`) VALUES ('qwe', 'qwe', '홍길동', '2000-01-01', 'MEMBER', '0');
INSERT INTO `shoppingmall2`.`member` (`me_id`, `me_pw`, `me_name`, `me_authority`, `me_point`) VALUES ('admin', 'admin', '관리자', 'ADMIN', '0');
INSERT INTO `shoppingmall2`.`member` (`me_id`, `me_pw`, `me_name`, `me_birth`, `me_authority`, `me_point`) VALUES ('hi', 'hi', '임선비', '2001-02-02', 'MEMBER', '0');
 
INSERT INTO `shoppingmall2`.`product_maincategory` (`pmc_name`) VALUES ('의류');
INSERT INTO `shoppingmall2`.`product_maincategory` (`pmc_name`) VALUES ('식품');
INSERT INTO `shoppingmall2`.`product_maincategory` (`pmc_name`) VALUES ('가전');
INSERT INTO `shoppingmall2`.`product_maincategory` (`pmc_name`) VALUES ('스포츠');
INSERT INTO `shoppingmall2`.`product_maincategory` (`pmc_name`) VALUES ('문구');

insert into product_subcategory(psc_name, psc_pmc_num)
	select '여성', pmc_num from productmaincategory where pmc_name = '의류';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '남성', pmc_num from productmaincategory where pmc_name = '의류';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '아동', pmc_num from productmaincategory where pmc_name = '의류';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '남녀공용', pmc_num from productmaincategory where pmc_name = '의류';

insert into product_subcategory(psc_name, psc_pmc_num)
	select '과일', pmc_num from productmaincategory where pmc_name = '식품';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '채소', pmc_num from productmaincategory where pmc_name = '식품';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '과자', pmc_num from productmaincategory where pmc_name = '식품';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '쌀/잡곡', pmc_num from productmaincategory where pmc_name = '식품';
    
insert into product_subcategory(psc_name, psc_pmc_num)
	select 'TV', pmc_num from productmaincategory where pmc_name = '가전';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '에어컨', pmc_num from productmaincategory where pmc_name = '가전';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '냉장고', pmc_num from productmaincategory where pmc_name = '가전';
    
insert into product_subcategory(psc_name, psc_pmc_num)
	select '수영', pmc_num from productmaincategory where pmc_name = '스포츠';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '골프', pmc_num from productmaincategory where pmc_name = '스포츠';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '자전거', pmc_num from productmaincategory where pmc_name = '스포츠';
    
insert into product_subcategory(psc_name, psc_pmc_num)
	select '사무용품', pmc_num from productmaincategory where pmc_name = '문구';
insert into product_subcategory(psc_name, psc_pmc_num)
	select '미술용품', pmc_num from productmaincategory where pmc_name = '문구';
 /*
 - 의류
	- 여성
    - 남성
    - 아동
    - 남녀공용

 - 식품
	- 과일
    - 채소
    - 과자
    - 쌀/잡곡
- 가전
	- TV
    - 냉장고
    - 에어컨
- 스포츠
	- 수영
    - 골프
    - 자전거
- 문구
	- 미술용품
    - 사무용품
 */
 
 /*
abc :   집, 서울시 강남, 12345
		회사, 서울시 강북, 23456
hi :	집, 경기도 안산, 45678
		회사, 서울시 강북, 32145
qwe :	집, 충북 청주, 32145
		처가, 서울시 강남, 12345
 */
 
 insert into address(ad_name, ad_address, ad_postnum, ad_me_id)
	values( '집', '서울시 강남', 12345, 'abc'),
    ('회사', '서울시 강북', 23456, 'abc'),
    ('집', '경기도 안산', 34567, 'hi'),
    ('회사', '서울시 강북', 32145, 'hi'),
    ('집', '충북 청주', 32145, 'qwe'),
    ('처가', '서울시 강남', 12345, 'qwe');
    
select * from address;

/*
- 의류 - 여성, 반집업 맨투맨, 세컨그라운드 여성용 반집업 맨투맨, now(), 10, 17000
	- 빨강, 노랑, 흰색
- 의류 - 여성, 세미 크롬맨투맨, 바블링브룩 여성용 세미 크롬 맨투맨, now(), 10, 19900
	- 흰색 S, 흰색 M, 흰색 L, 남색 S, 남색 M, 남색 L
- 의류 - 남성, 긴팔 카라티, 빅사이즈클럽 긴팔 카라티, now(), 20, 24900
	- S, M, L
- 의류 - 남성, 7부 브이넥 티셔츠, 해리슨 남성용 브이넥 7부 티셔츠, now(), 20, 24900
	- XS, S, M, L, XL
- 의류 - 남녀공용, 기모 조커팬츠, 우드피카 기모 조커팬츠, now(), 5, 24800
	- 24인치, 26인치, 28인치, 30인치, 32인치
- 의류 - 남녀공용, 슬림 스키니, 블랙 기모 슬림 스키니, now(), 100, 51840
	- 60cm, 64cm, 68cm, 72cm
*/

insert into product(pr_psc_num,pr_title, pr_contents, pr_reg_date, pr_amount, pr_price)
	values(1, '반집업 맨투맨', '세컨그라운드 여성용 반집업 맨투맨', now(), 10, 17000),
    (1, '세미 크롬맨투맨', '바블링브룩 여성용 세미 크롬 맨투맨', now(), 10, 19900),
    (2, '긴팔 카라티', '빅사이즈클럽 긴팔 카라티', now(), 20, 24900),
    (2, '7부 브이넥 티셔츠','해리슨 남성용 브이넥 7부 티셔츠', now(), 20, 24900),
    (4, '기모 조커팬츠', '우드피카 기모 조커팬츠', now(), 5, 24800),
    (4, '슬림 스키니', '블랙 기모 슬림 스키니', now(), 100, 51840);
select * from product;

insert into product_option(po_name, po_amount, po_pr_num)
	values ( '빨강', 5, 1 ), ( '노랑', 5, 1 ), ( '흰색', 5, 1 ),
    ('S', 5, 2 ), ('M', 5, 2 ), ('L', 5, 2 ),
    ('흰색 S', 5 , 3), ('흰색 M', 5 , 3), ('흰색 L', 5 , 3),
    ('남색 S', 5 , 3), ('남색 M', 5 , 3), ('남색 L', 5 , 3),
    ('XS', 5 , 4), ('S', 5 , 4), ('M', 5 , 4), ('L', 5 , 4), ('XL', 5 , 4),
    ('24인치', 5 , 5), ('26인치', 5 , 5), ('28인치', 5 , 5), ('30인치', 5 , 5), ('32인치', 5 , 5),
    ('60cm', 5 , 6), ('64cm', 5 , 6), ('68cm', 5 , 6), ('72cm', 5 , 6);
    
select * from product_option;