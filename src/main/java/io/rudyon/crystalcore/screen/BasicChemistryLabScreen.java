package io.rudyon.crystalcore.screen;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.ButtonWidget;
import net.minecraft.client.toast.SystemToast;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;

public class BasicChemistryLabScreen extends Screen {

	public BasicChemistryLabScreen(Text title) {
		super(title);
	}

	@Override
	protected void init() {
		// Crafting Grid (3x3)
		int startX = this.width / 2 - 50; // Positioning for the grid
		int startY = this.height / 2 - 50; // Center it vertically

		for (int i = 0; i < 9; i++) {
			int x = startX + (i % 3) * 30; // 3 columns
			int y = startY + (i / 3) * 30; // 3 rows
			ButtonWidget slotButton = ButtonWidget.builder(Text.of("Slot " + (i + 1)), (btn) -> {
				// Placeholder for slot interaction
			}).position(x, y).size(30, 30).build();
			this.addDrawable(slotButton);
		}

		// Output Slot (1)
		ButtonWidget outputSlot = ButtonWidget.builder(Text.of("Output"), (btn) -> {
			// Placeholder for crafting logic
			this.client.getToastManager().add(
				SystemToast.create(this.client, SystemToast.Id.NARRATOR_TOGGLE, Text.of("Crafting Result!"), Text.of("Crafting complete"))
			);
		}).position(startX + 90, startY + 60).size(30, 30).build(); // Output is below the grid
		this.addDrawable(outputSlot);

		// Craft Button
		ButtonWidget craftButton = ButtonWidget.builder(Text.of("Craft"), (btn) -> {
			// Crafting action (Placeholder)
			this.client.getToastManager().add(
				SystemToast.create(this.client, SystemToast.Id.NARRATOR_TOGGLE, Text.of("Crafting Result!"), Text.of("Crafting complete"))
			);
		}).position(startX + 90, startY + 100).size(60, 20).build();
		this.addDrawable(craftButton);
	}

	@Override
	public void render(GuiGraphics graphics, int mouseX, int mouseY, float delta) {
		super.render(graphics, mouseX, mouseY, delta);

		// Render instructions or custom UI elements
		graphics.drawText(this.textRenderer, "Chemistry Lab", this.width / 2 - 50, this.height / 2 - 100, 0xFFFFFFFF, true);
	}
}
