ALTER TABLE BBB_MEETING ADD COLUMN RECORDING CHAR(1) AFTER END_DATE;
ALTER TABLE BBB_MEETING ADD COLUMN RECORDING_DURATION PLS_INTEGER DEFAULT 0 AFTER RECORDING;
ALTER TABLE BBB_MEETING ADD COLUMN DELETED PLS_INTEGER DEFAULT 0 AFTER PROPERTIES;