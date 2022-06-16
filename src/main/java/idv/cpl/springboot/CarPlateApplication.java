package idv.cpl.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import idv.cpl.springboot.view.index.index;

@SpringBootApplication
public class CarPlateApplication extends AbstractJavaFxApplicationSupport {

	public static void main(String[] args) {
		launch(CarPlateApplication.class, index.class, args);
	}

}
