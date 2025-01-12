SELECT
    StudentID,
    AVG(Mark) AS OverallPercentage,
    CASE 
       WHEN AVG(Mark) < 40 THEN 'Fail'
       ELSE 'Pass'
    END AS PassFailStatus
FROM FinalExamMarks
GROUP BY StudentID
ORDER BY StudentID;