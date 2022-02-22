import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//EXTIENDE DE LA INTERFACE
public class servletStart extends SpringBootServletInitializer{

	@Override
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(CrudAplicationH2.class);
	}
}
