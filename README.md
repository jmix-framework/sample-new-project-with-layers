# Jmix Multi-Module Project

This is an example of a Jmix project split into three modules by layers: **data ← ui ← app**.

- `data` contains entities and services.
- `ui` depends on `data` and contains UI screens.
- `app` depends on both and contains only the main application class and properties.