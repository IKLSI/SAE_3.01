import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Stages
{
	@FXML
	private MenuButton menuButton;

	@FXML
	private AnchorPane panelCentre;

	public Stages(AnchorPane panelCentre)
	{
		this.panelCentre = panelCentre;
		try
		{
			panelCentre.getChildren().clear();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("Stage.fxml"));
			AnchorPane loadedPane = loader.load();

			panelCentre.getChildren().setAll(loadedPane.getChildren());
		}
		catch (Exception e) { e.printStackTrace(); }
	}
}