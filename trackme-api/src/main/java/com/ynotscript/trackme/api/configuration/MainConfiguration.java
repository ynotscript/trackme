package com.ynotscript.trackme.api.configuration;

import java.io.File;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.DefaultConfigurationBuilder;
import org.apache.log4j.Logger;

/**
 * 
 * Wrapper of an apache Configuration object.
 * 
 */
public final class MainConfiguration {

	/**
	 * Configuration file to use.
	 */
	private static final String CONFIG_FILE = "config.xml";

	/**
	 * The wrapped configuration.
	 */
	private static Configuration configuration;

	/**
	 * Logger of the class.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(MainConfiguration.class);

	/**
	 * To forbid the instantiation.
	 */
	private MainConfiguration() {
	}

	/**
	 * The one and only method to obtain the Configuration for the application.
	 * Ensures that the configuration is loaded once.
	 * 
	 * @return A CombinedConfiguration containing the values of all the files.
	 */
	public static Configuration getConfiguration() {
		if (null == configuration) {
			DefaultConfigurationBuilder builder = new DefaultConfigurationBuilder();
			builder.setFile(new File(CONFIG_FILE));
			try {
				configuration = builder.getConfiguration(true);
			} catch (ConfigurationException e) {
				LOGGER.error(e);
			}
		}
		return configuration;
	}

	/**
	 * Nested class containing db.properties keys.
	 */
	public static class Db {

		/**
		 * Prefix of the tables.
		 */
		public static final String DB_TABLE_PREFIX = "db.table.prefix";

		/**
		 * Suffix of the archived tables.
		 */
		public static final String DB_TABLE_ARCHIVE_SUFFIX = "db.table.archive.suffix";

		/**
		 * Database name.
		 */
		public static final String DB_NAME = "db.name";

		/**
		 * Database jndi.
		 */
		public static final String DB_JNDI = "db.jndi";

	}

}
