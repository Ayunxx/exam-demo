!<!--  -->
<template>
    <div id="building">
        <div class="" :data="topic">
            <el-row>
                <el-col :span="24" style="border-radius: 30px">{{ topic.topic }}</el-col>
            </el-row>
            <el-row>
                <el-col :span="18">
                    <el-form label-width="100px" class="demo-ruleForm">
                        <el-radio-group v-model="radio">
                            <el-radio :label='"A"'>{{ topic.a }}</el-radio>
                            <el-radio :label='"B"'>{{ topic.b }}</el-radio>
                            <el-radio :label='"C"'>{{ topic.c }}</el-radio>
                            <el-radio :label='"D"'>{{ topic.d }}</el-radio>
                        </el-radio-group>
                        <el-form-item>
                            <el-button type="primary" @click="getchekandNext()">提交</el-button>
                        </el-form-item>
                    </el-form>
                </el-col>
            </el-row>
        </div>
    </div>

</template>

<script>
//这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
//例如：import 《组件名称》 from '《组件路径》';

import zgjys from '@/api/zgjys';

export default {
    //import引入的组件需要注入到对象中才能使用
    inject: ['reload'],
    data() {
        //这里存放数据
        return {
            radio: null,
            topic: {
                topic: null,
                A: null,
                B: null,
                C: null,
                D: null,
                answer: null,
            }
        };
    },
    //监听属性 类似于data概念
    computed: {},
    //监控data中的数据变化
    watch: {},
    //方法集合
    methods: {
        //提交并检查
        getchekandNext() {
            if (this.radio == this.topic.answer) {
                this.$notify({
                    title: '回答正确',
                    message: '即将跳转至下一题',
                    type: 'success',
                });
                setTimeout(() => {
                    this.$router.go(0)
                }, 2 * 1000);
            } else {
                this.$notify.error({
                    title: '回答错误',
                    message: '再想想看'
                });
            }
        },

    },
    //生命周期 - 创建完成（可以访问当前this实例）
    created() {
        zgjys.req_getRandTopic(this.topic)
            .then(res => {
                this.topic = res.data
                //console.log(res.data)
                console.log(this.topic)
            })
    },
    //生命周期 - 挂载完成（可以访问DOM元素）
    mounted() {

    },
    beforeCreate() { }, //生命周期 - 创建之前
    beforeMount() { }, //生命周期 - 挂载之前
    beforeUpdate() { }, //生命周期 - 更新之前
    updated() { }, //生命周期 - 更新之后
    beforeDestroy() { }, //生命周期 - 销毁之前
    destroyed() { }, //生命周期 - 销毁完成
    activated() { }, //如果页面有keep-alive缓存功能，这个函数会触发
}
</script>
<style scoped>
/*@import url(); 引入公共css类*/
</style>