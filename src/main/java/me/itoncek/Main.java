package me.itoncek;

import me.tongfei.progressbar.ProgressBarBuilder;
import me.tongfei.progressbar.ProgressBarStyle;
import nu.olivertwistor.java.tui.Terminal;

@SuppressWarnings("ALL")
class Main {
    public static void main(final String[] args) throws Exception {

        String[] accept = new String[] {
                "yes",
                "y",
                "YES",
                "Y"
        };

        final boolean setupAllowed = Terminal.readBoolean("Setup allowed? (y/n)", accept);

        if (!setupAllowed) {
            System.exit(1);
        }

        ProgressBarBuilder pbb = new ProgressBarBuilder().setStyle(ProgressBarStyle.ASCII);



    }
}