# 糖果世界社区版 1.21.1

## 语言

[[English]](README.md)[简体中文]

## 开源许可证

- 模组*资源部分*公开但不允许随意使用，[ARR]保留所有权利。
- 模组*代码部分*通过[LGPLv3](LICENSE)开源。

## 下载

- 通过[MC百科](https://www.mcmod.cn/download/8526.html)下载。
- 自动构建版（GitHub Actions）。

## 编译

1. 在根目录下运行命令：`./gradlew build`
2. 编译好的mod文件将输出在`build\libs`

## 不通过GitHub Actions构建

```
repositories.clear()
repositories {
    maven { url = "https://libraries.minecraft.net/" }
    maven { url = "https://neoforged.forgecdn.net/releases" }
    maven { url = "https://neoforged.forgecdn.net/mojang-meta" }
    // Add here additional repositories if required by some of the dependencies below.
}
```