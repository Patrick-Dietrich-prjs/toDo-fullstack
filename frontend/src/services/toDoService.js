import api from './api.js';

const getAll = () => api.get('/todo');
const getById = (id) => api.get(`/todo/${id}`);
const save = (todo) => api.post('/todo', todo);
const remove = (id) => api.delete(`/todo/${id}`);
const update = (id, descricao) => api.put(`/todo/${id}`, descricao);