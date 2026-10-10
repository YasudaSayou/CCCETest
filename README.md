# Candycraft Community Edition 1.21.1

<hr>
## Languages

[English][[简体中文]](README_cn.md)

[![star](https://gitee.com/Bread-NiceCat/candycraftce/badge/star.svg?theme=dark)](https://gitee.com/Bread-NiceCat/candycraftce/stargazers)

<hr>
## Licence

- The mod *resource* is public but not allowed to be used without permission. [ARR] All rights reserved.
- The *code* is open-sourced via [LGPLv3](LICENSE).

<hr>

## Download

- get release version via [mcmod](https://www.mcmod.cn/download/8526.html).
- Auto-built(Nightly) versions([GitHub Actions](.docs/autobuild.md)).
- Compile by yourself [here](#Compile).

<hr>

## Compile

1. Simply execute the command `./gradlew build` in project root directory
2. Check products in `${engine}\build\libs\candycraftce-xxx-x.x.x.jar`

Installation information
=======

This template repository can be directly cloned to get you started with a new
mod. Simply create a new repository cloned from this one, by following the
instructions provided by [GitHub](https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template).

Once you have your clone, simply open the repository in the IDE of your choice. The usual recommendation for an IDE is either IntelliJ IDEA or Eclipse.

If at any point you are missing libraries in your IDE, or you've run into problems you can
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
{this does not affect your code} and then start the process again.

Mapping Names:
============
By default, the MDK is configured to use the official mapping names from Mojang for methods and fields 
in the Minecraft codebase. These names are covered by a specific license. All modders should be aware of this
license. For the latest license text, refer to the mapping file itself, or the reference copy here:
https://github.com/NeoForged/NeoForm/blob/main/Mojang.md

Additional Resources: 
==========
Community Documentation: https://docs.neoforged.net/  
NeoForged Discord: https://discord.neoforged.net/
