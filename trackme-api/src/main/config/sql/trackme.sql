SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';


-- -----------------------------------------------------
-- Table `trackme_partner`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `trackme_partner` (
  `id_partner` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(255) NULL ,
  PRIMARY KEY (`id_partner`) )
ENGINE = MyISAM;


-- -----------------------------------------------------
-- Table `trackme_operating_system`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `trackme_operating_system` (
  `id_operating_system` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(255) NOT NULL ,
  `version` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id_operating_system`) )
ENGINE = MyISAM;


-- -----------------------------------------------------
-- Table `trackme_application`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `trackme_application` (
  `id_application` INT NOT NULL AUTO_INCREMENT ,
  `id_application_partner` VARCHAR(255) NOT NULL ,
  `version` VARCHAR(45) NOT NULL ,
  `name` VARCHAR(255) NULL ,
  `id_partner` INT NOT NULL ,
  `id_operating_system` INT NOT NULL ,
  PRIMARY KEY (`id_application`) ,
  UNIQUE INDEX `unique_id_application_partner` (`id_application_partner` ASC, `version` ASC) ,
  INDEX `fk_application_partner` (`id_partner` ASC) ,
  INDEX `fk_application_operating_system` (`id_operating_system` ASC) ,
  CONSTRAINT `fk_application_partner`
    FOREIGN KEY (`id_partner` )
    REFERENCES `trackme_partner` (`id_partner` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_application_operating_system`
    FOREIGN KEY (`id_operating_system` )
    REFERENCES `trackme_operating_system` (`id_operating_system` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = MyISAM;


-- -----------------------------------------------------
-- Table `trackme_handset`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `trackme_handset` (
  `id_handset` INT NOT NULL AUTO_INCREMENT ,
  `id_handset_partner` VARCHAR(255) NULL ,
  PRIMARY KEY (`id_handset`) ,
  UNIQUE INDEX `unique_id_handset_partner` (`id_handset_partner` ASC) )
ENGINE = MyISAM;


-- -----------------------------------------------------
-- Table `trackme_handset_has_application`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `trackme_handset_has_application` (
  `id_handset` INT NOT NULL ,
  `id_application` INT NOT NULL ,
  `number_of_use` INT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (`id_handset`, `id_application`) ,
  INDEX `fk_handset_has_application_handset` (`id_handset` ASC) ,
  INDEX `fk_handset_has_application_application` (`id_application` ASC) ,
  CONSTRAINT `fk_handset_has_application_handset`
    FOREIGN KEY (`id_handset` )
    REFERENCES `trackme_handset` (`id_handset` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_handset_has_application_application`
    FOREIGN KEY (`id_application` )
    REFERENCES `trackme_application` (`id_application` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = MyISAM;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
