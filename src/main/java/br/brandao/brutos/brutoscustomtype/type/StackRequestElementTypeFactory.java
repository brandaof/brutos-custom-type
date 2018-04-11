package br.brandao.brutos.brutoscustomtype.type;

import org.brandao.brutos.StackRequestElement;
import org.brandao.brutos.type.Type;
import org.brandao.brutos.type.TypeFactory;

public class StackRequestElementTypeFactory 
	implements TypeFactory{

	@Override
	public Type getInstance() {
		return new StackRequestElementType();
	}

	@Override
	public boolean matches(Class<?> type) {
		return StackRequestElement.class.isAssignableFrom(type);
	}

	@Override
	public Class<?> getClassType() {
		return StackRequestElement.class;
	}

}
