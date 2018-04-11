package br.brandao.brutos.brutoscustomtype.type;

import org.brandao.brutos.Invoker;
import org.brandao.brutos.MvcResponse;
import org.brandao.brutos.type.AbstractType;
import org.brandao.brutos.type.Type;

/**
 *
 * @author Brandao
 */
public class StackRequestElementType 
	extends AbstractType 
	implements Type{

	@Override
	public Object convert(Object value) {
		Invoker invoker = Invoker.getInstance();
		return invoker.getStackRequest().getCurrent();
	}

	@Override
	public void show(MvcResponse response, Object value) {
		
	}

}
