use shoppingmall;

/*
- union, union all : 합집합
	- 속성 이름들이 같아야 함
- nuion : 중복을 제거
- union all : 중복을 제거 하지 않음
*/
select * from product where pr_amount > 10
	union
select * from product where pr_price > 10000;

select * from product where pr_amount > 10
	union all
select * from product where pr_price > 10000;

select pr_num, pr_title from product;
select pc_num, pc_name from product_category;