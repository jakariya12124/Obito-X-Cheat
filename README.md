# 🎯 Obito X Cheat

**Advanced Minecraft Client with Smooth Animations**

![Obito X Cheat Logo](/images/image3.png)

Obito X Cheat is an enhanced Minecraft client featuring:
- 🎨 Smooth animation framework
- ⚡ Performance optimizations
- 🔧 Advanced customization
- 📊 Quality-of-life improvements

---

## Features

✨ **Animation Framework**
- Easing functions (Linear, Ease-In, Ease-Out, Ease-In-Out, Bounce, Elastic)
- Smooth transitions for UI elements
- Property animations (position, scale, rotation, opacity)
- Chainable animations

🚀 **Performance**
- Optimized rendering pipeline
- Efficient animation manager
- Minimal memory footprint

⚙️ **Customization**
- Configurable animation speeds
- Custom easing curves
- Theme support

---

## Building

```bash
git clone https://github.com/jakariya12124/Obito-X-Cheat.git
cd Obito-X-Cheat
./gradlew build
```

The compiled JAR will be in `build/libs/Obito X Cheat.jar`

---

## Installation

1. Download the latest release from [Releases](https://github.com/jakariya12124/Obito-X-Cheat/releases)
2. Place `Obito X Cheat.jar` in your Minecraft mods folder
3. Launch Minecraft with Forge

---

## Usage

### Using Animations in Your Code

```java
// Create a simple position animation
Animation animation = new Animation(
    0,                    // start value
    100,                  // end value
    500,                  // duration (ms)
    Easing.EASE_IN_OUT   // easing function
);

animationController.addAnimation(animation);
```

---

## Contributing

Contributions are welcome! Please:
1. Fork the repository
2. Create a feature branch
3. Submit a pull request

---

## Support

⭐ If you like this project, please give it a star!

### Contact
- Discord: https://dsc.gg/nespola
- GitHub: [@jakariya12124](https://github.com/jakariya12124)

---

## License

This project is licensed under the MIT License - see LICENSE file for details.
