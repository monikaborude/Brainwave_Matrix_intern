SELECT 
    PassFailStatus,
    COUNT(*) AS NumStudents
FROM 
(
    SELECT
        StudentID,
        CASE 
           WHEN AVG(Mark) < 40 THEN 'Fail'
           ELSE 'Pass'
        END AS PassFailStatus
    FROM FinalExamMarks
    GROUP BY StudentID
) AS Sub
GROUP BY PassFailStatus;