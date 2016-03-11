package de.msg.terminfindung.gui.administration;

/*
 * #%L
 * Terminfindung
 * %%
 * Copyright (C) 2015 - 2016 Bundesverwaltungsamt (BVA), msg systems ag
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import de.msg.terminfindung.gui.terminfindung.AbstractController;

/**
 *  Controller des StartFlows
 *
 * @author msg systems ag, Maximilian Falter
 */
@Controller
public class AdminController extends AbstractController<AdminModel> {

	private static final Logger LOG = Logger.getLogger(AdminController.class);
	
	/**
	 * Führt den Login-Vorgang aus.
	 * 
	 * @param model Das Modell
	 */
	public void initialisiereModel(AdminModel model) {

		LOG.info("Initialisiere Modell");
	}

}