# Custom Quit & Join Messages

A simple and lightweight Minecraft plugin that allows you to fully customize the **join** and **quit** messages of your players.  
With easy configuration through the `config.yml`, you can personalize your server's atmosphere and style.

---

## ✨ Features
- Set **custom join and quit messages** for players.
- Use placeholders (e.g., `{player}` for the player’s name).
- Fully configurable in the `config.yml`.
- Supports Minecraft color codes and text formatting.

---

## ⚙️ Configuration
After installing the plugin and running the server once, a `config.yml` file will be generated inside the `plugins/CustomQuitJoinMessage` folder.  
Here’s the default configuration:

```yml
messages:
  join: "Welcome {player} to the server!"
  quit: "Goodbye {player}, see you next time!"
  # To set Color or make ist Bold use / §<ColorCode>
  # You can get the Color Codes here https://minecraft.tools/de/color-code.php
```

---

## 📥 Installation
1. Download the plugin `.jar` file.
2. Place it into your server’s `plugins` folder.
3. Restart or reload the server.
4. Edit the `config.yml` file to your liking.
5. Save changes and run `/reload` or restart the server.

---

## 📌 Requirements
- Minecraft server (Spigot, Paper, or a fork). *(only works in the **1.21** at the moment)*
- Java 8+ depending on your server version.

---

## 🤝 Contributing
Found a bug or have a feature request?  
Feel free to open an **issue** or submit a **pull request** on GitHub.
