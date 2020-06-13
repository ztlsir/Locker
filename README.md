# Locker

## Tasking

Given: 一个有空位置为1容量为1的柜子
When: 存一个包
Then: 返回一张票


Given: 一个空位置为0容量为1的柜子
When: 存一个包
Then: 错误提示


Given: 一张有效票
When: 去locker取包
Then: locker返回一个包


Given: 一张无效票
When: 去locker取包
Then: 错误提示

Given: 一张已去locker取过包的有效票
When: 去locker取包，
Then: locker返回错误信息