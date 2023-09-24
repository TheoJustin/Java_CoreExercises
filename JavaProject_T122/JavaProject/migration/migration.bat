@echo off
C:\xampp\mysql\bin\mysql.exe -u root < "%~dp0create+insert.sql" 2>errorLog.txt
IF %ERRORLEVEL% NEQ 0 (
    echo There were errors during execution. Check errorLog.txt for details.
) ELSE (
    echo Migration Completed!
)
