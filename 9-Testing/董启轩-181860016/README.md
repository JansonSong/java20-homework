# 添加测试

测试文件为SortTest.java，同时也进一步实现了CreatureList类(封装之前的creature列表)，其实现了iterable接口，同时基于已实现的ComparatorT类为CreatureList类实现类sort函数，之后执行sort即调用CreatureList的sort函数即可，可选给出参数order按照指定方式排序。

SortTest中，construction用于每次test之前的初始化。testSort函数用于测试positive和negative排序的正确性。testRandomsort用于测试随机排序的执行效率。
