package com.drool_issue.util;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

public class KnowledgeSessionHelper {

	public static KieContainer createRuleBase() throws Exception {
   	 KieServices ks = KieServices.Factory.get();
	     return ks.getKieClasspathContainer(); 	     
    }
	
	public static StatelessKieSession getStatelessSession(KieContainer kieContainer, String sessionName) {
		StatelessKieSession kieSession = kieContainer.newStatelessKieSession(sessionName);
		return kieSession;
				
	}
	public static KieSession getStatefulSession(KieContainer kieContainer, String sessionName) {
		KieSession kSession = kieContainer.newKieSession(sessionName);
		return kSession;				
	}
	
}
