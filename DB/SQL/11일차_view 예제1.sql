USE CGV;
-- 예매한 영화이름, 영화관, 좌석이름, 아이디, 상영일, 상영시간을 조회
CREATE VIEW TICKET_DETAIL2
AS
SELECT * FROM ticketing
	JOIN ticketing_seat ON ti_num = ts_ti_num
    JOIN seat ON se_num = ts_se_num
    JOIN screen_schedule ON ss_num = ti_ss_num
    JOIN movie ON mo_num = ss_mo_num
    JOIN cinema ON ci_name = ss_ci_num;
    
SELECT * FROM TICKET_DETAIL2;

CREATE VIEW TICKET_DETAIL2
AS
SELECT * FROM ticketing
	JOIN ticketing_seat ON ti_num = ts_ti_num
    JOIN seat ON se_num = ts_se_num
    JOIN screen_schedule ON ss_num = ti_ss_num
    JOIN movie ON mo_num = ss_mo_num
    JOIN cinema ON ci_name = ss_ci_num;
    
SELECT * FROM TICKET_DETAIL2;

SELECT * FROM TICKET_DETAIL2;