package net.minecraftforge.fml.client.config;

import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.ITextComponent;

public class GuiMessageDialog extends GuiDisconnected
{
    protected String buttonText;

    public GuiMessageDialog(GuiScreen nextScreen, String title, ITextComponent message, String buttonText)
    {
        super(nextScreen, title, message);
        this.buttonText = buttonText;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question. Called when the GUI is displayed and when the
     * window resizes, the buttonList is cleared beforehand.
     */
    @Override
    public void initGui()
    {
        super.initGui();
        buttonList.get(0).displayString = I18n.format(buttonText);
    }
}