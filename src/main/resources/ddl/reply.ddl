CREATE TABLE tbl_reply (
    reply_no INT(10) AUTO_INCREMENT,
    reply_text VARCHAR(1000) NOT NULL,
    reply_writer VARCHAR(50) NOT NULL,
    reply_date DATETIME default current_timestamp,
    board_no INT(10),
    ike_Cnt INT(10) NOT NULL,
    account VARCHAR(50),
    CONSTRAINT pk_reply PRIMARY KEY (reply_no),
    CONSTRAINT fk_reply_board
    FOREIGN KEY (board_no)
    REFERENCES tbl_board (board_no) ON DELETE CASCADE,
	CONSTRAINT fk_reply_user
    FOREIGN KEY (account)
    REFERENCES tbl_user (account)ON DELETE CASCADE 
);