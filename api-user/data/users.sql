-- -----------------------------------------------------
-- Table `mydb`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `users`.`Users` (
  `email` VARCHAR(255) NOT NULL,
  `firstname` VARCHAR(255) NOT NULL,
  `lastname` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `isAdmin` TINYINT NOT NULL,
  PRIMARY KEY (`email`)
);