package project.architecture.javaLogger.test;

import project.architecture.javaLogger.modules.core.LogManager;
import project.architecture.javaLogger.modules.core.Logger;


public class Main {
	public static void main(String[] args) {

		LogManager logManager = new LogManager();
		Logger logger = logManager.getLogger();
		Logger logger1 = logManager.getLogger("Kadary");
		
		if (logger.isInfoEnabled()) {
			logger.info("Ceci est un message tr�s tr�s long car on veut tester l'indentation du LoggerWriter pour pouvoir r�ajuster le texte dans la console/le fichier texte. Et blablabla... Et blablabla ! Baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin baratin. ");
		}
		if (logger1.isDebugEnabled()) {
			logger1.debug("Salut");
		}
		
		if (logger.isWarnEnabled()) {
			logger.warn("Test de la librairie");
		}
		
		logManager.closeLogger("Kadary");
		if (logger1.isErrorEnabled()) {
			logger1.error("Whaouuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
		}
	}

}
