package com.drool_issue.runner;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.drool_issue.domain.SampleDomain;
import com.drool_issue.util.KnowledgeSessionHelper;



public class RulesExecutor {
	public static final void main(String[] args) {
		KieSession ksession = null;
		try {

			KieContainer kieContainer = KnowledgeSessionHelper.createRuleBase();
			ksession = KnowledgeSessionHelper.getStatefulSession(kieContainer, "ksession-rules");
			SampleDomain sampleDomain = new SampleDomain();
			sampleDomain.setInstanceVariable1(1);
			sampleDomain.setInstanceVariable2("Value of instance variable");
			ksession.insert(sampleDomain);
			ksession.fireAllRules();

		} 
		catch (Throwable t) {
			t.printStackTrace();
		}
		finally {
			ksession.dispose();
		}
		
	}

}
