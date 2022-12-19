insert into movie_person(mp_name, mp_birth, mp_contry) values
( '안태진', NULL, '한국'), ( '류준열', '1986-09-25', '한국'), ( '유해진', '1970-01-04', '한국'), 
( '최무성', '1968-01-12', '한국'), ( '조성하', '1966-08-08', '한국'), ( '박명훈', '1975-05-28', '한국'), 
( '안은진', '1991-05-06', '한국'), ( '조윤서', '1993-01-04', '한국');

insert into movie(mo_title, mo_contents, mo_age, mo_run, mo_opening_date, mo_state)
values('올빼미','맹인이지만 뛰어난 침술 실력을 지닌 ‘경수’는 
어의 ‘이형익’에게 그 재주를 인정받아 궁으로 들어간다. ...',
'15세 이상',118,'2022-11-23','현재상영중');

insert into movie_genre(mg_ge_name, mg_mo_num)
	values ('스릴러', 2);

insert into movie_casting(mc_mp_num, mc_mo_num, mc_role)
	values(9, 2, '감독'), 
    (10, 2, '배우'), (11, 2, '배우'), (12, 2, '배우'), (13, 2, '배우'), 
    (14, 2, '배우'), (15, 2, '배우'), (16, 2, '배우'), (17, 2, '배우');

insert into trailer(tr_title, tr_mo_num ,tr_file_name)
	values ( '올빼미', 2 , 'http://h.vod.cgv.co.kr/vodCGVa/86481/86481_208327_1200_128_960_540.mp4');
    
insert into stillcut( st_mo_num, st_file_name)
	values ( 2, 'https://img.cgv.co.kr/Movie/Thumbnail/StillCut/000086/86481/86481210229_727.jpg');

insert into screen_schedule(ss_date, ss_time, ss_total_seat, ss_possible_seat,
	ss_mo_num, ss_ci_num)
    values('2022-12-20', '13:50', 10, 10, 2, 2),
    ('2022-12-20', '11:00', 10, 10, 2, 6),
    ('2022-12-20', '17:10', 10, 10, 2, 6);

-- abc 회원이 올빼미 12월 20일 13:50 3장 예매 A1, B1, C1

insert into ticketing(ti_amount, ti_me_id, ti_ss_num, ti_total_price)
values(3, 'abc', 25, 30000);

insert into ticketing_seat(ts_ti_num, ts_se_num)
	values(2, 11), (2, 13), (2, 15);

select * from screen_schedule;
update screen_schedule
	set ss_possible_seat = ss_possible_seat - 3
    where ss_num = 25;