import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import TelaCadastro from '../views/TelaCadastro.vue'
import TelaGraficos from '../views/TelaGraficos.vue'
import TelaProntuario from '../views/TelaProntuario.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/telacadastro',
    name: 'TelaCadastro',
    component: TelaCadastro
  },
  {
    path: '/telagrafico',
    name: 'TelaGrafico',
    component: TelaGraficos
  },
  {
    path: '/telaprontuario',
    name: 'TelaProntuario',
    component: TelaProntuario
  } 
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
