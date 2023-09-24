CREATE DATABASE TheJCourier;
USE TheJCourier;
CREATE TABLE HighScoreRecord(
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(20) NOT NULL,
  time_spent BIGINT NOT NULL,
  PRIMARY KEY(id)
);
INSERT INTO HighScoreRecord (name, time_spent) VALUES
('Jason Ananda', 55 * 1000 + 312);