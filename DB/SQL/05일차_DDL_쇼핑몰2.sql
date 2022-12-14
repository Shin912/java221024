-- drop database shoppingmall2;
create database if not exists shoppingmall2;

use shoppingmall2;


create table if not exists member( -- 사용자
	me_id varchar(20) primary key, -- 아이디
    me_pw varchar(20) not null, -- 비밀번호
    me_name varchar(20) not null, -- 이름
    me_birth date, -- 생일
    me_authority varchar(6) not null  default 'MEMBER', -- 권한 : 회원(MEMBER), 관리자(ADMIN)
    me_point int not null default 0
);

create table if not exists product_mainCategory( -- 대분류
	pmc_num int auto_increment primary key,
    pmc_name varchar(50) not null
);

create table if not exists product_subCategory( -- 중분류
	psc_num int auto_increment primary key,
    psc_name varchar(50) not null,
    psc_pmc_num int not null,
    constraint psc_pmc_num
		foreign key(psc_pmc_num) 
        references product_mainCategory(pmc_num)
);


create table if not exists product( -- 제품
	pr_num int auto_increment primary key, -- 제품번호
    pr_title varchar(50) not null, -- 제품명
    pr_contents longtext not null, -- 제품 상세
    pr_reg_date datetime not null default now(),
    pr_amount int not null default 0, -- 수량
    pr_price int not null default 0, -- 가격
    pr_pmc_num int not null, -- 제품 카테고리
    constraint pr_pmc_num
		foreign key(pr_pmc_num) 
        references product_subCategory(psc_num)
);
alter table product change pr_pmc_num pr_psc_num int default 0;

create table if not exists product_option( -- 제품옵션
	po_num int auto_increment primary key,
    po_name varchar(20) not null,
    po_amount int not null default 0,
    po_pr_num int not null,
    constraint po_pr_num
		foreign key(po_pr_num)
		references product(pr_num)
);

create table if not exists inquiry( -- 문의
	in_num int auto_increment primary key, -- 문의 번호
    in_contents longtext not null, -- 문의 내용
    in_reply longtext, -- 문의 답변
    in_pw char(4), -- 문의 비번
    in_me_id varchar(20) not null, -- 문의 아이디
    in_pr_num int not null, -- 문의 제품
    constraint fk_in_me_id
		foreign key(in_me_id) 
        references member(me_id),
	constraint fk_in_pr_num
		foreign key(in_pr_num) 
        references product(pr_num)
);

create table if not exists address( -- 주소록
	ad_num int auto_increment primary key,
    ad_address varchar(100) not null,
    ad_postnum char(5) not null,
    ad_name varchar(20) not null,
    ad_me_id varchar(20) not null,
    constraint ad_me_id
		foreign key(ad_me_id)
        references member(me_id)
);

create table if not exists orderhistory(
	oh_num int auto_increment primary key,
    oh_state varchar(15) not null default '결재완료',
    oh_totalprice int not null,
    oh_accpoint int not null,
    oh_usepoint int not null,
    oh_payment int not null,
    oh_ad_num int not null,
    oh_me_id varchar(20) not null,
    constraint oh_ad_num
		foreign key(oh_ad_num)
        references address(ad_num),
	constraint oh_me_id
		foreign key(oh_me_id)
        references member(me_id)
);

create table if not exists orderlist( -- 주문목록
	ol_num int auto_increment primary key,
	ol_amount int not null,
    ol_totalprice int not null,
    ol_oh_num int not null,
    ol_po_num int not null,
    constraint ol_oh_num
		foreign key(ol_oh_num)
        references orderhistory(oh_num),
	constraint ol_po_num
		foreign key(ol_po_num)
        references product_option(po_num)
);

create table if not exists shoppingbasket( -- 장바구니
	sb_num int auto_increment primary key,
    sb_amount int not null,
    sb_po_num int not null,
    sb_me_id varchar(20) not null,
    constraint sb_po_num
		foreign key(sb_po_num)
        references product_option(po_num),
	constraint sb_me_id
		foreign key(sb_me_id)
        references member(me_id)
);