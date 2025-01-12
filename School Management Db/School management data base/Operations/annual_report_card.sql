USE SchoolDB;

CREATE TABLE FinalAnnualReport
AS
SELECT
    S.StudentID,
    CONCAT(S.FirstName, ' ', S.LastName) AS StudentName,
    C.CourseID,
    C.Name AS CourseName,
    CONCAT(T.FirstName, ' ', T.LastName) AS TeacherName,
    FM.Mark AS FinalExamMark,
    (
        SELECT AVG(Mark)
        FROM FinalExamMarks
        WHERE StudentID = S.StudentID
    ) AS OverallPercentage
FROM Students S
JOIN FinalExamMarks FM
    ON S.StudentID = FM.StudentID
JOIN Courses C
    ON FM.CourseID = C.CourseID
JOIN Teachers T
    ON C.TeacherID = T.TeacherID
ORDER BY S.StudentID, C.CourseID;
SELECT *
FROM FinalAnnualReport;