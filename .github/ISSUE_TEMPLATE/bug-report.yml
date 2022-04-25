name: "🐛 问题反馈"
description: 报告错误或意外行为
labels: 
- 故障
body:
- type: markdown
  attributes:
    value: |
      请在新建一个问题之前先 [查找已有Issue](https://github.com/mike-brown8/zombie-survival-mod/issues) ！
- type: input
  attributes:
    label: 整合包版本号
    placeholder: |
      "9"
    description: |
      在更新工具打开时显示的当前版本处查看
  validations:
    required: true

- type: checkboxes
  attributes:
    label: 崩溃
    description: 游戏/更新器崩溃了吗？
    options:
      - label: "Yes"

- type: dropdown
  attributes:
    label: 出现故障的区域
    description: 故障出现在哪里？选择所有符合的项目
    multiple: true
    options:
      - 更新工具更新
      - 更新工具自我更新
      - 启动器安装基础包
      - 启动器启动
      - 游戏-合成表
      - 游戏-生物
      - 游戏-渲染
      - 其他
  validations:
    required: true

- type: textarea
  attributes:
    label: 重现步骤
    description: 我们强烈建议附加截图。
    placeholder: 告诉我们如何重现该问题。
  validations:
    required: true

- type: textarea
  attributes:
    label: ✔️ 期望行为
    placeholder: 该事件本应如何发生？
  validations:
    required: false

- type: textarea
  attributes:
    label: ❌ 实际行为
    placeholder: 但是却发生了什么？
  validations:
    required: false

- type: textarea
  attributes:
    label: 系统信息
    description: 填写你的系统信息
    placeholder: |
      Windows 7 旗舰版
      Windows 8.1 专业版
      Windows 8.1 家庭单语言版
      Windows 10 专业版
      Windows 10 家庭中文版
      Windows 11 专业版
      Windows 11 单语言版
  validations:
    required: true
