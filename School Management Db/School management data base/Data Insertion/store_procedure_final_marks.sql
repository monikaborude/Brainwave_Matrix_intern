DELIMITER $$

CREATE PROCEDURE InsertFinalExamMarks()
BEGIN
    DECLARE sid INT DEFAULT 1;
    DECLARE cid INT;
    DECLARE randMark DECIMAL(5,2);

    WHILE sid <= 50 DO
        SET cid = 1;
        WHILE cid <= 6 DO
            -- Generate a random mark between 0 and 100
            SET randMark = ROUND(RAND() * 100, 2);

            INSERT INTO FinalExamMarks (StudentID, CourseID, Mark, ExamDate)
            VALUES (sid, cid, randMark, '2025-06-10');

            SET cid = cid + 1;
        END WHILE;
        SET sid = sid + 1;
    END WHILE;
END $$

DELIMITER ;

-- Call the procedure once to generate data
CALL InsertFinalExamMarks();