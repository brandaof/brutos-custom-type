package br.brandao.brutos.brutoscustomtype.controller;

import org.brandao.brutos.StackRequestElement;
import org.brandao.brutos.annotation.Action;
import org.brandao.brutos.annotation.Basic;
import org.brandao.brutos.annotation.View;

/**
 *
 * @author Brandao
 */
public class IndexController {

	@Action("/")
	@View("controller/index")
    public void index(
    		@Basic(bean="value")
    		StackRequestElement value){
    }
    
}
