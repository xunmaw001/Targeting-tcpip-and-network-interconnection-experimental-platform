import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import xueshenghuping from '@/views/modules/xueshenghuping/list'
    import zuoyechengji from '@/views/modules/zuoyechengji/list'
    import banjitaolun from '@/views/modules/banjitaolun/list'
    import examfailrecord from '@/views/modules/examfailrecord/list'
    import shiyanbaogao from '@/views/modules/shiyanbaogao/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import examquestion from '@/views/modules/examquestion/list'
    import xueshengzuoye from '@/views/modules/xueshengzuoye/list'
    import laoshi from '@/views/modules/laoshi/list'
    import exampaper from '@/views/modules/exampaper/list'
    import baogaozhanshi from '@/views/modules/baogaozhanshi/list'
    import zuoyexinxi from '@/views/modules/zuoyexinxi/list'
    import discussbanjitaolun from '@/views/modules/discussbanjitaolun/list'
    import shiyancuijiao from '@/views/modules/shiyancuijiao/list'
    import shiyanxinxi from '@/views/modules/shiyanxinxi/list'
    import banjixinxi from '@/views/modules/banjixinxi/list'
    import shiyanchengji from '@/views/modules/shiyanchengji/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xueshenghuping',
        name: '学生互评',
        component: xueshenghuping
      }
      ,{
	path: '/zuoyechengji',
        name: '作业成绩',
        component: zuoyechengji
      }
      ,{
	path: '/banjitaolun',
        name: '班级讨论',
        component: banjitaolun
      }
      ,{
	path: '/examfailrecord',
        name: '错题本',
        component: examfailrecord
      }
      ,{
	path: '/shiyanbaogao',
        name: '实验报告',
        component: shiyanbaogao
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
      ,{
	path: '/xueshengzuoye',
        name: '学生作业',
        component: xueshengzuoye
      }
      ,{
	path: '/laoshi',
        name: '老师',
        component: laoshi
      }
      ,{
	path: '/exampaper',
        name: '实验题目管理',
        component: exampaper
      }
      ,{
	path: '/baogaozhanshi',
        name: '报告展示',
        component: baogaozhanshi
      }
      ,{
	path: '/zuoyexinxi',
        name: '作业信息',
        component: zuoyexinxi
      }
      ,{
	path: '/discussbanjitaolun',
        name: '班级讨论评论',
        component: discussbanjitaolun
      }
      ,{
	path: '/shiyancuijiao',
        name: '实验催缴',
        component: shiyancuijiao
      }
      ,{
	path: '/shiyanxinxi',
        name: '实验信息',
        component: shiyanxinxi
      }
      ,{
	path: '/banjixinxi',
        name: '班级信息',
        component: banjixinxi
      }
      ,{
	path: '/shiyanchengji',
        name: '实验成绩',
        component: shiyanchengji
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '考试记录',
        component: examrecord
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
