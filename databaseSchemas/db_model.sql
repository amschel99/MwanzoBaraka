CREATE TABLE `member` (
  `memberId` varchar(20) PRIMARY KEY NOT NULL,
  `firstName` varchar(255),
  `lastName` varchar(255),
  `registrationFee` int DEFAULT 2000,
  `group` varchar(255)
);

CREATE TABLE `Group` (
  `groupID` varchar(20) PRIMARY KEY NOT NULL,
  `registrationFee` int DEFAULT 5000
);

CREATE TABLE `monthlyContributions` (
  `id` varchar(255) PRIMARY KEY,
  `amount` int,
  `type` enum('group', 'individual'),
  `contributedAT` timestamp
);

CREATE TABLE `Loans` (
  `id` varchar(255) PRIMARY KEY,
  `amount` int,
  `type` enum('group', 'individual'),
  `borrowedAt` timestamp
);

CREATE TABLE `interests` (
  `Amount` int,
  `id` varchar(255) PRIMARY KEY,
  `type` enum('group', 'individual')
);

CREATE TABLE `dividends` (
  `Amount` int,
  `id` varchar(255) PRIMARY KEY,
  `type` enum('group', 'individual')
);

ALTER TABLE `member` ADD FOREIGN KEY (`group`) REFERENCES `Group` (`groupID`);

ALTER TABLE `monthlyContributions` ADD FOREIGN KEY (`id`) REFERENCES `member` (`memberId`);

ALTER TABLE `monthlyContributions` ADD FOREIGN KEY (`id`) REFERENCES `Group` (`groupID`);

ALTER TABLE `Loans` ADD FOREIGN KEY (`id`) REFERENCES `Group` (`groupID`);

ALTER TABLE `Loans` ADD FOREIGN KEY (`id`) REFERENCES `member` (`memberId`);

ALTER TABLE `interests` ADD FOREIGN KEY (`id`) REFERENCES `Group` (`groupID`);

ALTER TABLE `interests` ADD FOREIGN KEY (`id`) REFERENCES `member` (`memberId`);

ALTER TABLE `dividends` ADD FOREIGN KEY (`id`) REFERENCES `member` (`memberId`);

ALTER TABLE `dividends` ADD FOREIGN KEY (`id`) REFERENCES `Group` (`groupID`);
