import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/Index'
import Politics from '@/components/Politics'
import Politic from '@/components/politic'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Index',
      component: Index
    },{
      path: '/Politics/Rand',
      name: 'Politics',
      component: Politics
    },{
      path: '/Politics/politic',
      name: 'Politic',
      component: Politic
    }
  ]
})
