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
    import news from '@/views/modules/news/list'
    import yiyuanxinxi from '@/views/modules/yiyuanxinxi/list'
    import jigou from '@/views/modules/jigou/list'
    import guahaojilu from '@/views/modules/guahaojilu/list'
    import zaixianwenzhen from '@/views/modules/zaixianwenzhen/list'
    import pingjiayutousu from '@/views/modules/pingjiayutousu/list'
    import keshixinxi from '@/views/modules/keshixinxi/list'
    import quxiaoguahao from '@/views/modules/quxiaoguahao/list'
    import shixinmingdan from '@/views/modules/shixinmingdan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yishengxinxi from '@/views/modules/yishengxinxi/list'
    import discusszaixianwenzhen from '@/views/modules/discusszaixianwenzhen/list'
    import keshifenlei from '@/views/modules/keshifenlei/list'
    import yisheng from '@/views/modules/yisheng/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
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
	path: '/news',
        name: '名医讲堂',
        component: news
      }
      ,{
	path: '/yiyuanxinxi',
        name: '医院信息',
        component: yiyuanxinxi
      }
      ,{
	path: '/jigou',
        name: '机构',
        component: jigou
      }
      ,{
	path: '/guahaojilu',
        name: '挂号记录',
        component: guahaojilu
      }
      ,{
	path: '/zaixianwenzhen',
        name: '在线问诊',
        component: zaixianwenzhen
      }
      ,{
	path: '/pingjiayutousu',
        name: '评价与投诉',
        component: pingjiayutousu
      }
      ,{
	path: '/keshixinxi',
        name: '科室信息',
        component: keshixinxi
      }
      ,{
	path: '/quxiaoguahao',
        name: '取消挂号',
        component: quxiaoguahao
      }
      ,{
	path: '/shixinmingdan',
        name: '失信名单',
        component: shixinmingdan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/yishengxinxi',
        name: '医生信息',
        component: yishengxinxi
      }
      ,{
	path: '/discusszaixianwenzhen',
        name: '在线问诊评论',
        component: discusszaixianwenzhen
      }
      ,{
	path: '/keshifenlei',
        name: '科室分类',
        component: keshifenlei
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
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
    name: '首页',
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

export default router;
