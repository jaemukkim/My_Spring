Create Table BOARD (
    SEQ number(5) Primary Key, 
    TITLE varchar2 (200), 
    WRITER varchar2(20), 
    CONTENT varchar2(2000), 
    REGDATE date Default sysdate, 
   CNT number(5) Default 0
   ); 

INSERT INTO BOARD ( SEQ, TITLE, WRITER, CONTENT, REGDATE, CNT) 
VALUES (1, '�����λ�' , '������', '�ȳ��ϼ���. �ݰ����ϴ�. .... ', sysdate, default ); 

SELECT * FROM BOARD;
