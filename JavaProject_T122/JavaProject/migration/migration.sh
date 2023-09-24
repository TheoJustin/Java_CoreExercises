#!/bin/bash
mysql -u root < "$(dirname "$0")/create+insert.sql" 2>errorLog.txt
if [ $? -ne 0 ]; then
    echo "There were errors during execution. Check errorLog.txt for details."
else
    echo "Migration Completed!"
fi
