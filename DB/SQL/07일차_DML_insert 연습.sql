-- 의류 제품들을 높은 가격순으로 조회
select pmc_name as 분류, pr_title as 제품명, pr_price as 가격 from product
	join product_subcategory on pr_psc_num = psc_num
    join product_maincategory on pmc_num = psc_pmc_num
    where pmc_name = '의류' 
	order by pr_price desc;
    
-- 의류 제품들을 낮은 가격순으로 조회
select pmc_name as 분류, pr_title as 제품명, pr_price as 가격 from product
	join product_subcategory on pr_psc_num = psc_num
    join (select * from product_maincategory where pmc_name = '의류') as mc on pmc_num = psc_pmc_num
	order by pr_price asc;
    
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
-- 제품별 판매량을 조회
select pr_title as 제품명, ifnull(sum(ol_amount),0) as 판매량 from orderlist
	right join product_option on po_num = ol_po_num
    right join product on po_pr_num = pr_num
    group by po_pr_num
    order by 판매량 desc;
    
-- 의류 제품중 제품별 판매량을 조회, 제품명, 판매량을 조회
select pmc_name as 분류, pr_title as 제품명, ifnull(sum(ol_amount),0) as 판매량 from product
	join product_subcategory on pr_psc_num = psc_num
    join (select * from product_maincategory where pmc_name = '의류') as mc on pmc_num = psc_pmc_num
    right join product_option on po_pr_num = pr_num
    right join orderlist on ol_po_num = po_num
    group by po_pr_num
    order by 판매량 desc;

-- 제품별 최신순으로 조회 , 60개씩 보기
select * from product
    order by pr_reg_date desc
    limit 60;