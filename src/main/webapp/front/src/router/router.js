import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import ExamPaper from '../pages/exam/examPaper'
import Exam from '../pages/exam/exam'
import ExamList from '../pages/exam/examList'
import ExamRecord from '../pages/exam/examRecord'
import Storeup from '../pages/storeup/list'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import laoshiList from '../pages/laoshi/list'
import laoshiDetail from '../pages/laoshi/detail'
import laoshiAdd from '../pages/laoshi/add'
import banjixinxiList from '../pages/banjixinxi/list'
import banjixinxiDetail from '../pages/banjixinxi/detail'
import banjixinxiAdd from '../pages/banjixinxi/add'
import gonggaoxinxiList from '../pages/gonggaoxinxi/list'
import gonggaoxinxiDetail from '../pages/gonggaoxinxi/detail'
import gonggaoxinxiAdd from '../pages/gonggaoxinxi/add'
import shiyanxinxiList from '../pages/shiyanxinxi/list'
import shiyanxinxiDetail from '../pages/shiyanxinxi/detail'
import shiyanxinxiAdd from '../pages/shiyanxinxi/add'
import shiyanbaogaoList from '../pages/shiyanbaogao/list'
import shiyanbaogaoDetail from '../pages/shiyanbaogao/detail'
import shiyanbaogaoAdd from '../pages/shiyanbaogao/add'
import baogaozhanshiList from '../pages/baogaozhanshi/list'
import baogaozhanshiDetail from '../pages/baogaozhanshi/detail'
import baogaozhanshiAdd from '../pages/baogaozhanshi/add'
import xueshenghupingList from '../pages/xueshenghuping/list'
import xueshenghupingDetail from '../pages/xueshenghuping/detail'
import xueshenghupingAdd from '../pages/xueshenghuping/add'
import shiyanchengjiList from '../pages/shiyanchengji/list'
import shiyanchengjiDetail from '../pages/shiyanchengji/detail'
import shiyanchengjiAdd from '../pages/shiyanchengji/add'
import shiyancuijiaoList from '../pages/shiyancuijiao/list'
import shiyancuijiaoDetail from '../pages/shiyancuijiao/detail'
import shiyancuijiaoAdd from '../pages/shiyancuijiao/add'
import zuoyexinxiList from '../pages/zuoyexinxi/list'
import zuoyexinxiDetail from '../pages/zuoyexinxi/detail'
import zuoyexinxiAdd from '../pages/zuoyexinxi/add'
import xueshengzuoyeList from '../pages/xueshengzuoye/list'
import xueshengzuoyeDetail from '../pages/xueshengzuoye/detail'
import xueshengzuoyeAdd from '../pages/xueshengzuoye/add'
import zuoyechengjiList from '../pages/zuoyechengji/list'
import zuoyechengjiDetail from '../pages/zuoyechengji/detail'
import zuoyechengjiAdd from '../pages/zuoyechengji/add'
import banjitaolunList from '../pages/banjitaolun/list'
import banjitaolunDetail from '../pages/banjitaolun/detail'
import banjitaolunAdd from '../pages/banjitaolun/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'examPaper',
					component: ExamPaper
				},
				{
					path: 'examList',
					component:ExamList
				},
				{
					path: 'examRecord/:type',
					component:ExamRecord
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'laoshi',
					component: laoshiList
				},
				{
					path: 'laoshiDetail',
					component: laoshiDetail
				},
				{
					path: 'laoshiAdd',
					component: laoshiAdd
				},
				{
					path: 'banjixinxi',
					component: banjixinxiList
				},
				{
					path: 'banjixinxiDetail',
					component: banjixinxiDetail
				},
				{
					path: 'banjixinxiAdd',
					component: banjixinxiAdd
				},
				{
					path: 'gonggaoxinxi',
					component: gonggaoxinxiList
				},
				{
					path: 'gonggaoxinxiDetail',
					component: gonggaoxinxiDetail
				},
				{
					path: 'gonggaoxinxiAdd',
					component: gonggaoxinxiAdd
				},
				{
					path: 'shiyanxinxi',
					component: shiyanxinxiList
				},
				{
					path: 'shiyanxinxiDetail',
					component: shiyanxinxiDetail
				},
				{
					path: 'shiyanxinxiAdd',
					component: shiyanxinxiAdd
				},
				{
					path: 'shiyanbaogao',
					component: shiyanbaogaoList
				},
				{
					path: 'shiyanbaogaoDetail',
					component: shiyanbaogaoDetail
				},
				{
					path: 'shiyanbaogaoAdd',
					component: shiyanbaogaoAdd
				},
				{
					path: 'baogaozhanshi',
					component: baogaozhanshiList
				},
				{
					path: 'baogaozhanshiDetail',
					component: baogaozhanshiDetail
				},
				{
					path: 'baogaozhanshiAdd',
					component: baogaozhanshiAdd
				},
				{
					path: 'xueshenghuping',
					component: xueshenghupingList
				},
				{
					path: 'xueshenghupingDetail',
					component: xueshenghupingDetail
				},
				{
					path: 'xueshenghupingAdd',
					component: xueshenghupingAdd
				},
				{
					path: 'shiyanchengji',
					component: shiyanchengjiList
				},
				{
					path: 'shiyanchengjiDetail',
					component: shiyanchengjiDetail
				},
				{
					path: 'shiyanchengjiAdd',
					component: shiyanchengjiAdd
				},
				{
					path: 'shiyancuijiao',
					component: shiyancuijiaoList
				},
				{
					path: 'shiyancuijiaoDetail',
					component: shiyancuijiaoDetail
				},
				{
					path: 'shiyancuijiaoAdd',
					component: shiyancuijiaoAdd
				},
				{
					path: 'zuoyexinxi',
					component: zuoyexinxiList
				},
				{
					path: 'zuoyexinxiDetail',
					component: zuoyexinxiDetail
				},
				{
					path: 'zuoyexinxiAdd',
					component: zuoyexinxiAdd
				},
				{
					path: 'xueshengzuoye',
					component: xueshengzuoyeList
				},
				{
					path: 'xueshengzuoyeDetail',
					component: xueshengzuoyeDetail
				},
				{
					path: 'xueshengzuoyeAdd',
					component: xueshengzuoyeAdd
				},
				{
					path: 'zuoyechengji',
					component: zuoyechengjiList
				},
				{
					path: 'zuoyechengjiDetail',
					component: zuoyechengjiDetail
				},
				{
					path: 'zuoyechengjiAdd',
					component: zuoyechengjiAdd
				},
				{
					path: 'banjitaolun',
					component: banjitaolunList
				},
				{
					path: 'banjitaolunDetail',
					component: banjitaolunDetail
				},
				{
					path: 'banjitaolunAdd',
					component: banjitaolunAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
		{
			path: '/exam',
			component: Exam
		}
	]
})
