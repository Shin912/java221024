-- abc회원이 반집업 맨투맨(1번제품) 빨강을 2개 장바구니에 담았다. 이 때 실행되어야 하는 쿼리 작성

select * from product_option;
insert into shoppingbasket(sb_amount, sb_po_num, sb_me_id)
	values ( 2, 1, 'abc');
-- select 2, 'abc' , po_num from product_option where po_pr_num = 1 and po_title = '빨강';  

-- abc회원이 장바구니에 담긴 모든 제품을 구매. 이때 실행되어야 하는 쿼리 작성
-- 적립 포인트는 제품 금액의 10%. 사용 포인트는 X. 배송지는 집
select * from orderlist;
insert into orderhistory( oh_totalprice, oh_accpoint, oh_usepoint,
	oh_payment, oh_me_id, oh_ad_num)
    values ( 17000*2, floor(17000*2/10), 0 , 17000*2, 'abc', 1);

insert into orderlist(ol_amount, ol_totalprice, ol_oh_num,ol_po_num)
	values ( 2, 17000*2, 1, 1);
    
UPDATE product_option 
SET 
    po_amount = po_amount - 2
WHERE
    po_num = 1;