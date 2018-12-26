# js-project01-webapp


	CREATE TABLE TBL_BOARD(
		BNO INT NOT NULL auto_increment,
	    TITLE VARCHAR(200) NOT NULL,
	    CONTENT TEXT NULL,
	    WRITER VARCHAR(50) NOT NULL,
	    REGDATE TIMESTAMP NOT NULL DEFAULT NOW(),
	    VIEWCNT INT default 0,
	    primary key(BNO)
	    );
    
	CREATE TABLE TBL_MEMBER(
		USER_ID varchar(50) NOT NULL,
	    USER_PW VARCHAR(50) NOT NULL,
	    USER_NAME varchar(50) NOT NULL,
	    USER_EMAIL VARCHAR(200) NULL,
	    USER_REGDATE TIMESTAMP NOT NULL default NOW(),
	    USER_UPDATEDATE TIMESTAMP NOT NULL default NOW(),
	    primary KEY(USER_ID)
	    );    
    
	INSERT INTO TBL_MEMBER (USER_ID, USER_PW, USER_NAME, USER_EMAIL)
	VALUES ('173295', '173295', '안진성', '173295@shinsegae.com');
	SHOW TABLES;

	DROP TABLE TBL_Mtbl_memberEMBER;


	SELECT * FROM TBL_BOARD;
	SELECT * FROM TBL_MEMBER;

	DELETE FROM TBL_BOARD WHERE BNO=8;

	use book_ex;
    
    
    
